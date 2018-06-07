package net.ldauvilaire.sample.jms.domain.xsd.filter.comparison;

import org.apache.commons.lang.StringUtils;

import net.ldauvilaire.sample.jms.domain.xsd.filter.ComparisonOperator;

public class GreaterOrEqualsFilter extends AbstractBinaryComparisonFilter {

    public GreaterOrEqualsFilter(String attribute, String value) {
        super(ComparisonOperator.GREATER_OR_EQUALS, attribute, value);
    }

    @Override
    public String toSqlString() {
        StringBuilder builder = new StringBuilder(this.attribute);
        builder.append(" >= ").append(this.value);
        return builder.toString();
    }

    @Override
    public String toXmlString(int level) {
        String prefix = StringUtils.leftPad("", level*3, " ");
        StringBuilder builder = new StringBuilder("");
        builder.append(prefix).append("<").append(this.operator.name()).append(">").append("\n");
        builder.append(prefix).append("   ").append("<ATTRIBUTE>").append(this.attribute).append("</ATTRIBUTE>").append("\n");
        builder.append(prefix).append("   ").append("<VALUE>").append(this.value).append("</VALUE>").append("\n");
        builder.append(prefix).append("</").append(this.operator.name()).append(">").append("\n");
        return builder.toString();
    }
}
