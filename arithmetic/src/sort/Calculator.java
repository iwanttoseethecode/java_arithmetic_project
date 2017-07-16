package sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * ����һ������������ַ���������������
 *  ������׺���ʽת��׺���ʽ��   ����������������ջ������ƥ���ջ��ջ����������ȼ��иߵ�֮�־�ȫ����ջ
 *  
 *  �����⣬�������
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
	 * �����㹫ʽ���жӱ��ʽת��Ϊ������ʽ
	 * */
	private void infixTransformSuffix(){
		int length = formulaString.length();
		//��׺���ʽ�ַ���
		String suffixString = null;
		Character lastSign = null;
		
		//���������ַ���
		for(int i=0 ; i<length ; i++){
			if(stringStack.size()>0){ 
				lastSign = stringStack.peek();//��¼��һ���������
			}
			char sign = formulaString.charAt(i);
			
			if(matchSign(sign)){ //�ж��Ƿ�Ϊ�����
				
				stringStack.push(sign);//�������ջ
				
				if(sign==')'){ //��������ţ��Ͱ������ڵ��������ջ����������
					Character mySign = null;
					while(stringStack.size()>0 && !(mySign=stringStack.pop()).toString().equals('(')){
						if(!(mySign=='('||mySign==')')){
							suffixString = suffixString + mySign;
						}
					}
					if(stringStack.size()>0){//����ǰ���Ҳ��ս
						suffixString = suffixString + stringStack.pop();
					}
				}else if(stringStack.size()>2 && lastSign!=null && !checkPriority(lastSign,stringStack)){//����������֮ǰ����������ȼ���һ�����������������ջ
					int n = 0;
					while(n < 2){
						suffixString = suffixString + stringStack.pop();
						n++;
					}
				}
				
			}else{//�����ַ��������ʽ�ַ���
				suffixString = suffixString + sign;
			}
			
		}
		
		while(stringStack.size()!=0){ //��ջ�е������������ջ
			suffixString = suffixString + stringStack.pop();
		}
		
		stringStack.clear();
		for(int i = suffixString.length()-1; i>=0; i--){//����׺���ʽ�������ջ��
			stringStack.push(suffixString.charAt(i));
		}
	}
	
	//���ݺ�׺���ʽ������
	private double calculator(){
		//����û�м�������ݵ�ջ
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
					throw new RuntimeException("������ʽ����");
				}
			}else{
				remainStack.push(thisSign);
			}
		}
		
		return number;
	}
	
	/*
	 * ƥ�����
	 * */
	private boolean matchSign(char sign){
		if(sign=='+' || sign=='-' || sign=='*' || sign=='/' || sign=='%' || sign=='(' || sign==')'){
			return true;
		}
		return false;
	}
	
	/*
	 * ��������ȼ���ͬ�ͷ���true,����ͷ���false
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
