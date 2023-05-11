public class diagram {
    private state start;
    private state curState;
    private state finite;

    public diagram(){
        state s0 = new state("s0");
        state s1 = new state("s1");
        state s2 = new state("s2");
        state s3 = new state("s3");
        state s4 = new state("s4");

        s0.setGo(s0, s1);
        s1.setGo(s2, s4);
        s2.setGo(s3, s4);
        s3.setGo(s2, s1);
        s4.setGo(s3, s1);

        start = s0;
        finite = s2;
    }

    public boolean isFinite(String in){
        curState = start;
        while(in.length() != 0){
            char firstChar = in.charAt(0);
            if(firstChar == '0'){
                curState = curState.getGo0();
            }
            else if(firstChar == '1'){
                curState = curState.getGo1();
            }
            in = in.substring(1);
        }
        if(curState.equals(finite)) return true;
        else return false;
    }
}
