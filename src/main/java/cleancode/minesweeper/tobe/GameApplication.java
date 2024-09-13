package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweeper.Minesweeper;
import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.Beginner;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Beginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     * 고수준 모듈이 저수준 모듈을 직접 참조하는 것이 아닌 저수준 모듈을 추상화한 인터페이스를 참조
     *
     * DI (Dependency Injection)
     * - 제 3자가 두 객체 간 의존성을 맺어주고 주입
     *
     * IoC (Inversion of Control)
     * - 제어의 순방향 : 개개발자가 직접 프로그램의 흐름을 설계하고, 그 흐름을 주도
     * - 제어의 역전 : 개발자가 작성한 코드는 프레임워크 안에 포함되어 하나의 톱니바퀴 역할을 하고, 그 흐름은 프레임워크가 주도
     */
}
