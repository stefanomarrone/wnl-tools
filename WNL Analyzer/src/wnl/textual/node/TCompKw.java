/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.node;

import wnl.textual.analysis.Analysis;

@SuppressWarnings("nls")
public final class TCompKw extends Token
{
    public TCompKw()
    {
        super.setText("component");
    }

    public TCompKw(int line, int pos)
    {
        super.setText("component");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCompKw(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCompKw(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCompKw text.");
    }
}
