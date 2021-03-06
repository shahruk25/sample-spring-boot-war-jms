package net.ldauvilaire.sample.jms.domain.filter.comparison;

import net.ldauvilaire.sample.jms.domain.filter.AbstractFilter;
import net.ldauvilaire.sample.jms.domain.filter.ComparisonOperator;

public abstract class AbstractComparisonFilter extends AbstractFilter {

    protected ComparisonOperator operator;
    protected String attribute;

    public AbstractComparisonFilter(ComparisonOperator operator, String attribute) {
        this.operator = operator;
        this.attribute = attribute;
    }

    @Override
    public boolean isLogic() {
        return false;
    }

    public ComparisonOperator getOperator() {
        return this.operator;
    }

    public String getAttribute() {
        return this.attribute;
    }
}
