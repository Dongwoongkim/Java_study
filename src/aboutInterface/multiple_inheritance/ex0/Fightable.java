package aboutInterface.multiple_inheritance.ex0;

public interface Fightable extends Movable, Attackable {
    void attackAndMove(int power, int m);
}
