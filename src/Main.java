import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws IOException {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            Calculos c = new Calculos();


            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                c.calculateHappyNumber(line);

            }



            }



    }

