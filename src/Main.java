//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
XMLModel xml = new XMLModel();
String GetHWText(){
  String hw = new String();
  return xml.XMLToString();
}
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println("Hello and welcome!");

  for (int i = 1; i <= 5; i++) {
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    IO.println("i = " + i);
  }

  CheckCommit();
  IO.println(GetHWText());
}

private void CheckCommit(){
  IO.println("IIf you see that, branch is worked");
}
//first proj