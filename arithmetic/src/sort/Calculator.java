package sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 传入一个四则运算的字符串，并对其运算
 *  根据中缀表达式转后缀表达式，   数字输出，运算符进栈，括号匹配出栈，栈中运算符优先级有高低之分就全部出栈
 *  
 *  有问题，下面代码
 * */

public class Calculator {
	
	private String formulaString;
	
	private Stack<Character> stringStack;
	
	public Calculator(){
		super();
		stringStack = new Stack<>();
	}

	public Calculator(String formulaString) {
		super();
		this.formulaString = formulaString;
		stringStack = new Stack<>();
	}

	public String getFormulaString() {
		return formulaString;
	}

	public void setFormulaString(String formulaString) {
		this.formulaString = formulaString;
	}
	
	
	public double getCalculater(){
		infixTransformSuffix();
		return calculator();
	}
	
	/*
	 * 将计算公式的中队表达式转变为后最表达式
	 * */
	private void infixTransformSuffix(){
		int length = formulaString.length();
		//后缀表达式字符串
		String suffixString = null;
		Character lastSign = null;
		
		//遍历整个字符串
		for(int i=0 ; i<length ; i++){
			if(stringStack.size()>0){ 
				lastSign = stringStack.peek();//记录上一个运算符号
			}
			char sign = formulaString.charAt(i);
			
			if(matchSign(sign)){ //判断是否为运算符
				
				stringStack.push(sign);//运算符入栈
				
				if(sign==')'){ //如果有括号，就把括号内的运算符出栈，不包括好
					Character mySign = null;
					while(stringStack.size()>0 && !(mySign=stringStack.pop()).toString().equals('(')){
						if(!(mySign=='('||mySign==')')){
							suffixString = suffixString + mySign;
						}
					}
					if(stringStack.size()>0){//括号前面的也出战
						suffixString = suffixString + stringStack.pop();
					}
				}else if(stringStack.size()>2 && lastSign!=null && !checkPriority(lastSign,stringStack)){//如果运算符和之前的运算符优先级不一样则这两个运算符出栈
					int n = 0;
					while(n < 2){
						suffixString = suffixString + stringStack.pop();
						n++;
					}
				}
				
			}else{//将数字放入后最表达式字符串
				suffixString = suffixString + sign;
			}
			
		}
		
		while(stringStack.size()!=0){ //将栈中的所有运算符出栈
			suffixString = suffixString + stringStack.pop();
		}
		
		stringStack.clear();
		for(int i = suffixString.length()-1; i>=0; i--){//将后缀表达式倒叙加入栈中
			stringStack.push(suffixString.charAt(i));
		}
	}
	
	//根据后缀表达式计算结果
	private double calculator(){
		//保存没有计算的数据的栈
		Stack<Character> remainStack = new Stack<>();
		double number = 0;
		
		while(stringStack.size()>0){
			char thisSign=stringStack.pop();
			if(thisSign=='-'||thisSign=='+'||thisSign=='*'||thisSign=='?'||thisSign=='%'){
				if(remainStack.size()>2){
					double a = Double.parseDouble(remainStack.pop().toString());
					double b = Double.parseDouble(remainStack.pop().toString());
					
					BigDecimal bBig = new BigDecimal(b);
					BigDecimal aBig = new BigDecimal(a);
					if(thisSign=='-'){
						number = bBig.subtract(aBig).doubleValue();
					}else if(thisSign=='%'){
						number = bBig.remainder(aBig).doubleValue();
					}else if(thisSign=='+'){
						number = bBig.add(aBig).doubleValue();
					}else if(thisSign=='*'){
						number = bBig.multiply(aBig).doubleValue();
					}else if(thisSign=='/'){
						number = bBig.divide(aBig).doubleValue();
					}
				}else{
					throw new RuntimeException("运算表达式错误");
				}
			}else{
				remainStack.push(thisSign);
			}
		}
		
		return number;
	}
	
	/*
	 * 匹配符号
	 * */
	private boolean matchSign(char sign){
		if(sign=='+' || sign=='-' || sign=='*' || sign=='/' || sign=='%' || sign=='(' || sign==')'){
			return true;
		}
		return false;
	}
	
	/*
	 * 运算符优先级相同就返回true,否则就返回false
	 * */
	private boolean checkPriority(char sign,Stack<Character> myStack){
		
		char mySign = myStack.peek();
		
		List<Character> p1 = new ArrayList<Character>();
		p1.add('+');
		p1.add('-');
		
		List<Character> p2 = new ArrayList<Character>();
		p2.add('*');
		p2.add('/');
		p2.add('%');
		if(p1.contains(sign)&&p1.contains(mySign)){
			return true;
		}
		if(p2.contains(sign)&&p2.contains(mySign)){
			return true;
		}
		return false;
	}
	
	
}
