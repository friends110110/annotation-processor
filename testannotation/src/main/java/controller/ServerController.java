package controller;

import com.example.Getter;

//https://blog.csdn.net/dslztx/article/details/46715803
//https://blog.mythsman.com/2017/12/19/1/
//debug using maven intellij AbstractProcessor
//http://blog.jensdriller.com/how-to-debug-a-java-annotation-processor-using-intellij/
@Getter
public class ServerController {
    private String name;
    public static void main(String[] args) {
        ServerController app = new ServerController();
        System.out.println(app.getName());
    }
}
