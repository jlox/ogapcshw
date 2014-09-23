public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String ixPart = str.substring(1, 3);
  if (ixPart.equals("ix")) {
  return true;}
  else {
  return false;}
}

public String makeOutWord(String out, String word) {
  String open = out.substring(0, 2);
  String close = out.substring(2, 4);
  return open + word + close;
}

public String firstHalf(String str) {
  return str.substring(0, (str.length() / 2));
}
