/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.node;

import wnl.textual.analysis.Analysis;

@SuppressWarnings("nls")
public final class TAttackKw extends Token
{
    public TAttackKw()
    {
        super.setText("attack");
    }

    public TAttackKw(int line, int pos)
    {
        super.setText("attack");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAttackKw(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAttackKw(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAttackKw text.");
    }
}
