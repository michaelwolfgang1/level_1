import Utils.ArrayTools;
import constants.Settings;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameFormU1 {
    static JFrame GAME_FORM = new JFrame("GAME");
    private JButton firstButton = null;
    private int foundPairs = 0;
    private boolean isProcessing = false;
    private final List<JButton> matchedButtons = new ArrayList<>();

    void createGameForm() {
        GAME_FORM.getContentPane().removeAll();
        GAME_FORM.setLayout(null);
        GAME_FORM.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GAME_FORM.setResizable(false);
        GAME_FORM.setBounds(Settings.FORM_POSITION_COORD, Settings.FORM_POSITION_COORD,
                Settings.FORM_WIDTH, Settings.FORM_HEIGHT);

        // Сброс координат для новой игры
        int startX = 10;
        int startY = 10;
        createButtons(startX, startY);

        GAME_FORM.setVisible(true);
        GAME_FORM.repaint();
    }

    void createButtons(int startX, int startY) {
        int[] buttonNumbers = ArrayTools.generateArray(Settings.BUTTOMS_AMOUNT);
        int x = startX;
        int y = startY;
        int colCount = 0;
        int maxCols = 4; // Количество кнопок в ряду

        for (int buttonNumber : buttonNumbers) {
            JButton gameButton = new JButton();
            gameButton.setName(String.valueOf(buttonNumber));
            gameButton.setBounds(x, y, Settings.BUTTOM_WIDTH_HEIGHT, Settings.BUTTOM_WIDTH_HEIGHT);

            gameButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isProcessing || matchedButtons.contains(gameButton)) {
                        return; // Игнорируем нажатия во время обработки или на найденные пары
                    }

                    // Показываем число на кнопке
                    gameButton.setText(gameButton.getName());

                    if (firstButton == null) {
                        // Первая кнопка в паре
                        firstButton = gameButton;
                    } else {
                        // Вторая кнопка в паре
                        isProcessing = true; // Блокируем обработку новых кликов

                        if (firstButton.getName().equals(gameButton.getName())) {
                            // Найдена пара
                            matchedButtons.add(firstButton);
                            matchedButtons.add(gameButton);
                            firstButton = null;
                            foundPairs++;

                            // Проверка завершения игры
                            if (foundPairs * 2 == Settings.BUTTOMS_AMOUNT) {
                                JOptionPane.showMessageDialog(GAME_FORM, "Поздравляем! Все пары найдены!");
                                GAME_FORM.dispose();
                            } else {
                                isProcessing = false;
                            }
                        } else {
                            // Не совпали - скрываем через 1 секунду
                            Timer timer = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    firstButton.setText("");
                                    gameButton.setText("");
                                    firstButton = null;
                                    isProcessing = false;
                                }
                            });
                            timer.setRepeats(false);
                            timer.start();
                        }
                    }
                }
            });

            GAME_FORM.add(gameButton);
            x += Settings.BUTTOM_WIDTH_HEIGHT + 10;
            colCount++;

            if (colCount >= maxCols) {
                colCount = 0;
                x = startX;
                y += Settings.BUTTOM_WIDTH_HEIGHT + 10;
            }
        }
    }

    public static void main(String[] args) {
        GameFormU1 game = new GameFormU1();
        game.createGameForm();
    }
}