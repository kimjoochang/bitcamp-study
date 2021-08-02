package com.eomcs.pms.menu;

public class MenuGroup extends Menu {
  Menu [] childs = new Menu[100];
  int size;

  // 생성자를 정의하지 않으면 컴파일러가 기본 생성자를 자동으로 추가해준다.
  // 문제는 컴파일러가 추가한 기본 생성자는 수퍼 클래스의 기본 생성자를 호출하기 때문에
  // 컴파일 오류가 발생한다.
  // Menu클래스에는 기본 생성자가 없다.
  // 따라서 개발자가 직접 생성자를 정의해야 한다.

  public MenuGroup(String title) {
    super(title);
  }

  // MenuGroup이 포함하는 객체인 Menu를 다룰 수 있도록 메서드를 정의한다.
  public void add(Menu childMenu) {
    if(size == childs.length) {
      return; // 하위 메뉴를 저장할 배열이 꽉 찼다면 더 이상 저장해서는 안된다.
    }
    this.childs[this.size++] = childMenu;
  }

  // 배열에 들어있는 Menu 객체를 찾아 제거한다.
  public void remove(Menu child) {
    int index = indexOf(child);
    for (int i = index+1; i < this.size; i++) {
      this.childs[i-1] = childs[i];
    }
    childs[--this.size] = null;
  }

  // 배열에 들어 있는 Menu 객체의 인덱스를 알아낸다.
  public int indexOf(Menu child) {
    for(int i = 0; i<this.size; i++) {
      if (this.childs[i]==child) {
        return i;
      }
    }
    return -1;
  }

  // 배열에 들어 있는 Menu 객체를 찾는다.
  public Menu getMenu(String title) {
    for(int i = 0; i < this.size; i++) {
      if(this.childs[i].title.equals(title)) {
        return childs[i];
      }
    }
    return null;
  }

  @Override
  public void execute() {

  }
}