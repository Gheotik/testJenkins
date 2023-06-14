package org.cours;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Transformer {
     HashMap<String, String> tokens = new HashMap<String, String>();

     void AddToken(String token, String value){
          this.tokens.put(token,value);
     }
     void RemoveToken(String token){
          tokens.remove(token);
     }
     String transformer(String phrase){
          int capacity = (int) (phrase.length()*1.2f);

          StringBuilder stringBuilder = new StringBuilder(capacity);
          Pattern pattern = Pattern.compile("\\{(.*?)\\}");
          Matcher matcher = pattern.matcher(phrase);
          while (matcher.find()){
               String token = matcher.group(1);
               String value = tokens.get(token);
               if (value != null)
                    matcher.appendReplacement(stringBuilder, value);
               else
                    matcher.appendReplacement(stringBuilder, "{"+ token + "}");
          }
          matcher.appendTail(stringBuilder);
          return stringBuilder.toString();
     }


}