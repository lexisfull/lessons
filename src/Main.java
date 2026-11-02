//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    MyLinkedList<String> list = new MyLinkedList<String>();
    list.addFirst("Привет");
    list.addFirst("Проходи");
    list.addFirst("Пока");

    System.out.println(list.get(2));

}
