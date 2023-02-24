package chapter1;

import java.util.Objects;

public class Hero implements Cloneable {
  public String name;
  public int hp, mp;
  public Sword sword;

  public Hero clone() {
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.mp = this.mp;
    result.sword = this.sword.clone();
    return result;
  }

  public String toString() {
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
  }

  public Hero() {
    this.name = "";
  }

  public Hero(String name) {
    this.name = name;
  }

  public Sword getSword() {
    return this.sword;
  }

  public void setSword(Sword sword) {
    this.sword = sword;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (o == null)
      return false;
    if (!(o instanceof Hero))
      return false;
    Hero r = (Hero) o;
    if (!this.name.trim().equals(r.name.trim())) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return Objects.hash(this.name, this.hp, this.mp);
  }
}
