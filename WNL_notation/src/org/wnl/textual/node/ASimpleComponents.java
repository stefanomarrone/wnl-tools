/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleComponents extends PComponents
{
    private PComponent _component_;

    public ASimpleComponents()
    {
        // Constructor
    }

    public ASimpleComponents(
        @SuppressWarnings("hiding") PComponent _component_)
    {
        // Constructor
        setComponent(_component_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleComponents(
            cloneNode(this._component_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleComponents(this);
    }

    public PComponent getComponent()
    {
        return this._component_;
    }

    public void setComponent(PComponent node)
    {
        if(this._component_ != null)
        {
            this._component_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._component_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._component_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._component_ == child)
        {
            this._component_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._component_ == oldChild)
        {
            setComponent((PComponent) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}