package org.diverse.pcm.api.java.impl.value;

import org.diverse.pcm.api.java.Value;
import org.diverse.pcm.api.java.impl.ValueImpl;
import org.diverse.pcm.api.java.util.PCMVisitor;
import org.diverse.pcm.api.java.value.Conditional;

/**
 * Created by gbecan on 14/10/14.
 */
public class ConditionalImpl extends ValueImpl implements Conditional {

    private pcm.Conditional kConditional;

    public ConditionalImpl(pcm.Conditional kConditional) {
        super(kConditional);
        this.kConditional = kConditional;
    }

    public pcm.Conditional getkConditional() {
        return kConditional;
    }

    @Override
    public Value getValue() {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void setValue(Value value) {
        kConditional.setValue(((ValueImpl) value).getkValue());
    }

    @Override
    public Value getCondition() {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void setCondition(Value condition) {
        kConditional.setCondition(((ValueImpl) condition).getkValue());
    }

    @Override
    public void accept(PCMVisitor visitor) {
        visitor.visit(this);
    }
}
