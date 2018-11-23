/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.analysis;

import java.util.*;
import org.wnl.textual.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleModel(ASimpleModel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleServices(ASimpleServices node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListServices(AListServices node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleService(ASimpleService node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleDetectbody(ASimpleDetectbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneDetectbody(ANoneDetectbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleContbody(ASimpleContbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListContbody(AListContbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleSbody(ASimpleSbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListSbody(AListSbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleComponents(ASimpleComponents node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListComponents(AListComponents node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleComponent(ASimpleComponent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlainCbody(APlainCbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStructCbody(AStructCbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneUses(ANoneUses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleUses(ASimpleUses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleUbody(ASimpleUbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListUbody(AListUbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleAttacks(ASimpleAttacks node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListAttacks(AListAttacks node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleAttack(ASimpleAttack node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleAbody(ASimpleAbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleAffbody(ASimpleAffbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListAffbody(AListAffbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleDescr(ASimpleDescr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleFailure(ASimpleFailure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleReplication(ASimpleReplication node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleRedundancy(ASimpleRedundancy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleSuccess(ASimpleSuccess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlainFloatingpoint(APlainFloatingpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEngFloatingpoint(AEngFloatingpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEng2Floatingpoint(AEng2Floatingpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntFixedpoint(AIntFixedpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFixedpoint(ADecFixedpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABothFixedpoint(ABothFixedpoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPosnegIntnum(APosnegIntnum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumAbsnum(ANumAbsnum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAname(AIdAname node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdSname(AIdSname node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdContname(AIdContname node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdCname(AIdCname node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNodetecKw(TNodetecKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDetecKw(TDetecKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTImplKw(TImplKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAonKw(TAonKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNouseKw(TNouseKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUseKw(TUseKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAttackKw(TAttackKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTServKw(TServKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCompKw(TCompKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDescrKw(TDescrKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFailureKw(TFailureKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRedundancyKw(TRedundancyKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReplicationKw(TReplicationKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSuccessKw(TSuccessKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOCurl(TOCurl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCCurl(TCCurl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEng(TEng node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUnoeng(TUnoeng node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSpaces(TSpaces node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSpace(TSpace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTText(TText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCtrlZ(TCtrlZ node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
