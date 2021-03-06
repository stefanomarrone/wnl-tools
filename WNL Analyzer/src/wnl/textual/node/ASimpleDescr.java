/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.node;

import wnl.textual.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASimpleDescr extends PDescr
{
    private TDescrKw _descrKw_;
    private TText _text_;
    private TSemi _semi_;

    public ASimpleDescr()
    {
        // Constructor
    }

    public ASimpleDescr(
        @SuppressWarnings("hiding") TDescrKw _descrKw_,
        @SuppressWarnings("hiding") TText _text_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setDescrKw(_descrKw_);

        setText(_text_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleDescr(
            cloneNode(this._descrKw_),
            cloneNode(this._text_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleDescr(this);
    }

    public TDescrKw getDescrKw()
    {
        return this._descrKw_;
    }

    public void setDescrKw(TDescrKw node)
    {
        if(this._descrKw_ != null)
        {
            this._descrKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._descrKw_ = node;
    }

    public TText getText()
    {
        return this._text_;
    }

    public void setText(TText node)
    {
        if(this._text_ != null)
        {
            this._text_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._text_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._descrKw_)
            + toString(this._text_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._descrKw_ == child)
        {
            this._descrKw_ = null;
            return;
        }

        if(this._text_ == child)
        {
            this._text_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._descrKw_ == oldChild)
        {
            setDescrKw((TDescrKw) newChild);
            return;
        }

        if(this._text_ == oldChild)
        {
            setText((TText) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
