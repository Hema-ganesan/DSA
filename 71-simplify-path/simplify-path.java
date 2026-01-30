class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] hema=path.split("/");
        for(String temp:hema)
        {
            if(temp.equals(".") || temp.isEmpty())
             continue;
            else if(temp.equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else
            {
                s.push(temp);
            }
        }
        return "/"+String.join("/",s);
    }
}