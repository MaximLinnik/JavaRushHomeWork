package com.javarush.test.level23.lesson13.big01;


import java.awt.event.KeyEvent;

/**
 * Основной класс программы.
 */
public class Room
{
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake)
    {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public Snake getSnake()
    {
        return snake;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setSnake(Snake snake)
    {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    /**
     *  Основной цикл программы.
     *  Тут происходят все важные действия
     */
    public void run()
    {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive())
        {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents())
            {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        //Выводим сообщение "Game Over"
        System.out.println("Game Over!");
    }

    /**
     * Выводим на экран текущее состояние игры
     */
    public void print()
    {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int [][] screen = new int[getHeight()][getWidth()];
        //Рисуем все кусочки змеи
        for(int i=0;i<snake.getSections().size();i++){
            int x = snake.getSections().get(i).getX();
            int y = snake.getSections().get(i).getY();
            if (i == 0)
            {
                screen[x][y] = 2;
            } else
            {
                screen[x][y] = 1;
            }
        }
        //Рисуем мышь
        screen[mouse.getX()][mouse.getY()] = 3;
        //Выводим все это на экран
        for (int x = 0; x < getHeight(); x++)
        {
            for (int y = 0; y < getWidth(); y++)
            {
                if (screen[x][y] == 0) {
                    System.out.print(' ');
                } else if (screen[x][y] == 1) {
                    System.out.print('x');
                } else if (screen[x][y] == 2) {
                    System.out.print('X');
                }

            }
            System.out.println();
        }
    }

    /**
     * Метод вызывается, когда мышь съели
     */
    public void eatMouse()
    {
        createMouse();
    }

    /**
     * Создает новую мышь
     */
    public void createMouse()
    {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }


    public static Room game;

    public static void main(String[] args)
    {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }


    /**
     * Прогрмма делает паузу, длинна которой зависит от длинны змеи.
     */
    public void sleep()
    {
        try
        {
            int pause = 500 - (snake.getSections().size()*20);
            if (pause < 200) Thread.sleep(200);
            else Thread.sleep(pause);
        }
        catch (InterruptedException e){}
    }
}
