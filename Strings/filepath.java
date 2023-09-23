import java.util.Stack;

public class filepath {
    public static void main(String[] args) {
        String s = "/a/./b/./../c//.//";
        System.out.println(simplifyPath3(s));
    }

    static String simplifyPath3(String path) {
        StringBuilder output = new StringBuilder();

		int index = path.length() - 1;
		int ignoreAmt = 0;
		while (index >= 0) {
			// read out all of the '/'
			while (path.charAt(index) == '/') {
				index--;
				if (index < 0) {
					break;
				}
			}

			// end the loop if can no longer read at index
			if (index < 0) {
				break;
			}

			// ignore this dir
			if (path.length() > 1 && path.charAt(index) == '.' && path.charAt(index - 1) == '/') {
				index -= 2;
				continue;
			}

			// ignore the next dir unless it's also ../
			if (path.length() > 2 && path.charAt(index) == '.' && path.charAt(index - 1) == '.' && path.charAt(index - 2) == '/') {
				index -= 3;
				ignoreAmt += 1;
				continue;
			}

			// it will always begin with / so this is ok
			while (path.charAt(index) != '/') {
				if (ignoreAmt == 0) {
					output.append(path.charAt(index));
				}
				index--;
			}

			if (ignoreAmt > 0) {
				ignoreAmt--;
				index--;
				continue;
			}

			output.append('/');
		}

		output.reverse();
		String s = output.toString();
		// if all directories are ignored there will be no slash
		if (s.length() == 0) {
			return "/";
		} else {
			return output.toString();
		}
    }

	public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/') continue;

            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                i++;
            }

            if(temp.equals(".")) continue;
            else if(temp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }

            }
            else{
                st.push(temp);
            }
        }
        
        String ans="";
        while(!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        if(ans.length()==0) return "/";
        return ans;
    }

	public String simplifyPath2(String path) {
        Stack<String>st=new Stack<>();
        
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/') continue;

            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                i++;
            }

            if(temp.equals(".")) continue;
            else if(temp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }

            }
            else{
                st.push(temp);
            }
        }
        
        String ans="";
        while(!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        if(ans.length()==0) return "/";
        return ans;
    }
}
