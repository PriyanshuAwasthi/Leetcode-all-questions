class Solution {
    public int maximum69Number (int num) {
        // String st = "";
        // st += num;
        // char c[] = st.toCharArray();
        // for(int i = 0; i < c.length; i++) if(c[i] == '6') { c[i] = '9'; break; }
        // return Integer.parseInt(new String(c));
        return Integer.parseInt(("" + num).replaceFirst("6", "9"));
    }
}

//999696966