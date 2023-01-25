package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String[] str = ("" + number).split("");
        System.out.print("\n");
        for(int i = (str.length - 1); i >= 0; i--){
            System.out.print(str[i]);
        }
    }
}
