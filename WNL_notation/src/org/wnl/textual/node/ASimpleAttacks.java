/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleAttacks extends PAttacks
{
    private PAttack _attack_;

    public ASimpleAttacks()
    {
        // Constructor
    }

    public ASimpleAttacks(
        @SuppressWarnings("hiding") PAttack _attack_)
    {
        // Constructor
        setAttack(_attack_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleAttacks(
            cloneNode(this._attack_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleAttacks(this);
    }

    public PAttack getAttack()
    {
        return this._attack_;
    }

    public void setAttack(PAttack node)
    {
        if(this._attack_ != null)
        {
            this._attack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._attack_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._attack_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._attack_ == child)
        {
            this._attack_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._attack_ == oldChild)
        {
            setAttack((PAttack) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
