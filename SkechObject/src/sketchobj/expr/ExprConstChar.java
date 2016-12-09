package sketchobj.expr;

import java.util.List;

import constraintfactory.ConstData;
import constraintfactory.ExternalFunction;
import sketchobj.core.Type;
import sketchobj.core.TypePrimitive;

public class ExprConstChar extends ExprConstant{
	
	private String val;
	public ExprConstChar(String s){
		this.setVal(s);
	}

	@Override
	public Type getType() {
		return new TypePrimitive(17);
	}

	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    public String toString()
    {
        return val;
    }
    
	@Override
	public ConstData replaceConst(int index, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replaceLinearCombination() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Expression other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ExternalFunction> extractExternalFuncs(List<ExternalFunction> externalFuncNames) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVal(String val) {
		this.val = val;
	}

}