package 栈;

import java.util.Stack;

/*
* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class __20__有效的括号 {


    public boolean isValid(String s) {
        int length=s.length();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < length; i++) {
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            if(c==')'||c=='}'||c==']'){
                if(st.empty()!=true){
                    char LeftC=st.pop();
                    if(c==')'&&LeftC!='('){
                        return false;
                    }
                    if(c=='}'&&LeftC!='{'){
                        return false;
                    }
                    if(c==']'&&LeftC!='['){
                        return false;
                    }
                }else return false;

            }
        }
        if(st.empty()){
            return true;
        }else return false;
    }

////初级方法1：直接使用循环
//    public boolean isValid(String s) {
//        while(s.contains("()")||s.contains("{}")||s.contains("[]")){
//            s=s.replace("()","");
//            s=s.replace("{}","");
//            s=s.replace("[]","");
//        }
//        boolean flag=false;
//        if(s.length()==0){
//            flag=true;
//        }
//        return flag;
//    }

}
