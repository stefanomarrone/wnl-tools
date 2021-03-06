/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.node;

import wnl.textual.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASimpleReplication extends PReplication
{
    private TReplicationKw _replicationKw_;
    private PAbsnum _absnum_;
    private TSemi _semi_;

    public ASimpleReplication()
    {
        // Constructor
    }

    public ASimpleReplication(
        @SuppressWarnings("hiding") TReplicationKw _replicationKw_,
        @SuppressWarnings("hiding") PAbsnum _absnum_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setReplicationKw(_replicationKw_);

        setAbsnum(_absnum_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleReplication(
            cloneNode(this._replicationKw_),
            cloneNode(this._absnum_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleReplication(this);
    }

    public TReplicationKw getReplicationKw()
    {
        return this._replicationKw_;
    }

    public void setReplicationKw(TReplicationKw node)
    {
        if(this._replicationKw_ != null)
        {
            this._replicationKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._replicationKw_ = node;
    }

    public PAbsnum getAbsnum()
    {
        return this._absnum_;
    }

    public void setAbsnum(PAbsnum node)
    {
        if(this._absnum_ != null)
        {
            this._absnum_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._absnum_ = node;
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
            + toString(this._replicationKw_)
            + toString(this._absnum_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._replicationKw_ == child)
        {
            this._replicationKw_ = null;
            return;
        }

        if(this._absnum_ == child)
        {
            this._absnum_ = null;
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
        if(this._replicationKw_ == oldChild)
        {
            setReplicationKw((TReplicationKw) newChild);
            return;
        }

        if(this._absnum_ == oldChild)
        {
            setAbsnum((PAbsnum) newChild);
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
