package br.uniso;

import java.io.*;
import java.util.ListResourceBundle;

public class ReadFile {

    public static void main (String[] args){
        //criar o arquivo
        File f = new File("alunos.txt");

        //fluxo de entrada, HD > memória
        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            //enquanto a linha não for nula
            while(linha != null){
                //imprimir
                System.out.println(linha);
                //passa para a próxima
                linha = br.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
