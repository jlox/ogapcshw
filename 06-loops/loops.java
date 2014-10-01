public class loops {

public String frontTimes(String str, int n) {
  String result = "";
  if (str.length() < 4){
  while (n > 0){
  result = result + str;
  n = n - 1;
  }
  return result;
  } else {
  while (n > 0) {
  result = result + str.substring(0, 3);
  n = n - 1;
  }
  return result;
  }
}

public String stringBits(String str) {
  int n = 0;
  String result = "";
  while (n < str.length()){
  result = result + str.charAt(n);
  n = n + 2;
  }
  return result;
}

// had lots of trouble with this
public String stringYak(String str) {
  String result = "";
  int search = 0;
  while (search < str.length()-1){
  if (search+2<str.length() && str.charAt(search)=='y' && str.charAt(search + 2)== 'k'){
  search = search + 2;
  } else {
  result = result + str.charAt(search);
  }
  }
  return result;
}

//had trouble with this too
public int stringMatch(String a, String b) {
  int count = 0;
  int result = 0;
  while (count<(a.length()-1) && count<(b.length()-1)){
  String parta = a.substring(count, count+2);
  String partb = b.substring(count, count+2);
  if (parta.equals(partb)){
  result = result + 1;
  } else {
  count = count + 1;
  }
  }
  return result;
}
}
