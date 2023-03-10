package de.mqrvcoding.tictactoe;

import net.miginfocom.swing.MigLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {

    private char player = 'x';
    private int winsX = 0, winsO = 0;

    private final JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private final JLabel lblWinsX, lblWinsO;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(() -> {
            try {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MainFrame() {
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 400);

        try {
            setIconImage(ImageIO.read(new File("." + File.separator + "res" + File.separator + "icon.png")));
        } catch (IOException e) {
            System.err.println("Couldn't load icon!");
            e.printStackTrace();
        }

        JPanel contentPane = new JPanel(new MigLayout("", "[400px][150px]", "[400px]")); //"", "cols", "rows"
        setContentPane(contentPane);

        //region Create JPanel with JButtons
        JPanel pnlGame = new JPanel(new GridLayout(3, 3));
        pnlGame.setSize(400, 400);
        contentPane.add(pnlGame, "grow");

        btn1 = new JButton("");
        btn1.addActionListener(this::buttonClick);
        btn1.setFocusable(false);
        pnlGame.add(btn1);

        btn2 = new JButton("");
        btn2.addActionListener(this::buttonClick);
        btn2.setFocusable(false);
        pnlGame.add(btn2);

        btn3 = new JButton("");
        btn3.addActionListener(this::buttonClick);
        btn3.setFocusable(false);
        pnlGame.add(btn3);

        btn4 = new JButton("");
        btn4.addActionListener(this::buttonClick);
        btn4.setFocusable(false);
        pnlGame.add(btn4);

        btn5 = new JButton("");
        btn5.addActionListener(this::buttonClick);
        btn5.setFocusable(false);
        pnlGame.add(btn5);

        btn6 = new JButton("");
        btn6.addActionListener(this::buttonClick);
        btn6.setFocusable(false);
        pnlGame.add(btn6);

        btn7 = new JButton("");
        btn7.addActionListener(this::buttonClick);
        btn7.setFocusable(false);
        pnlGame.add(btn7);

        btn8 = new JButton("");
        btn8.addActionListener(this::buttonClick);
        btn8.setFocusable(false);
        pnlGame.add(btn8);

        btn9 = new JButton("");
        btn9.addActionListener(this::buttonClick);
        btn9.setFocusable(false);
        pnlGame.add(btn9);
        //endregion

        //region Create JPanel with Stats
        JPanel pnlStats = new JPanel(new MigLayout("", "[grow]", "[grow][grow]"));
        pnlStats.setSize(150, 400);
        contentPane.add(pnlStats, "grow");

        lblWinsX = new JLabel("X: " + winsX);
        pnlStats.add(lblWinsX, "cell 0 0, center");
        lblWinsO = new JLabel("O: " + winsO);
        pnlStats.add(lblWinsO, "cell 0 1, center");
        //endregion
    }

    private void buttonClick(ActionEvent e) {
        if (player == 'x') {
            if (e.getSource().equals(btn1)) {
                if (btn1.isEnabled()) {
                    btn1.setText("X");
                    btn1.setEnabled(false);
                }
            } else if (e.getSource().equals(btn2)) {
                if (btn2.isEnabled()) {
                    btn2.setText("X");
                    btn2.setEnabled(false);
                }
            } else if (e.getSource().equals(btn3)) {
                if (btn3.isEnabled()) {
                    btn3.setText("X");
                    btn3.setEnabled(false);
                }
            } else if (e.getSource().equals(btn4)) {
                if (btn4.isEnabled()) {
                    btn4.setText("X");
                    btn4.setEnabled(false);
                }
            } else if (e.getSource().equals(btn5)) {
                if (btn5.isEnabled()) {
                    btn5.setText("X");
                    btn5.setEnabled(false);
                }
            } else if (e.getSource().equals(btn6)) {
                if (btn6.isEnabled()) {
                    btn6.setText("X");
                    btn6.setEnabled(false);
                }
            } else if (e.getSource().equals(btn7)) {
                if (btn7.isEnabled()) {
                    btn7.setText("X");
                    btn7.setEnabled(false);
                }
            } else if (e.getSource().equals(btn8)) {
                if (btn8.isEnabled()) {
                    btn8.setText("X");
                    btn8.setEnabled(false);
                }
            } else if (e.getSource().equals(btn9)) {
                if (btn9.isEnabled()) {
                    btn9.setText("X");
                    btn9.setEnabled(false);
                }
            }

            if (playerWon()) {
                JOptionPane.showMessageDialog(null, "Player X won!");
                setButtonsEnabled(true);
                clearButtons();
                winsX++;
                lblWinsX.setText("X: " + winsX);
            }
            player = 'o';
        } else {
            if (e.getSource().equals(btn1)) {
                if (btn1.isEnabled()) {
                    btn1.setText("O");
                    btn1.setEnabled(false);
                }
            } else if (e.getSource().equals(btn2)) {
                if (btn2.isEnabled()) {
                    btn2.setText("O");
                    btn2.setEnabled(false);
                }
            } else if (e.getSource().equals(btn3)) {
                if (btn3.isEnabled()) {
                    btn3.setText("X");
                    btn3.setEnabled(false);
                }
            } else if (e.getSource().equals(btn4)) {
                if (btn4.isEnabled()) {
                    btn4.setText("O");
                    btn4.setEnabled(false);
                }
            } else if (e.getSource().equals(btn5)) {
                if (btn5.isEnabled()) {
                    btn5.setText("O");
                    btn5.setEnabled(false);
                }
            } else if (e.getSource().equals(btn6)) {
                if (btn6.isEnabled()) {
                    btn6.setText("O");
                    btn6.setEnabled(false);
                }
            } else if (e.getSource().equals(btn7)) {
                if (btn7.isEnabled()) {
                    btn7.setText("O");
                    btn7.setEnabled(false);
                }
            } else if (e.getSource().equals(btn8)) {
                if (btn8.isEnabled()) {
                    btn8.setText("O");
                    btn8.setEnabled(false);
                }
            } else if (e.getSource().equals(btn9)) {
                if (btn9.isEnabled()) {
                    btn9.setText("O");
                    btn9.setEnabled(false);
                }
            }

            if (playerWon()) {
                JOptionPane.showMessageDialog(null, "Player O won!");
                setButtonsEnabled(true);
                clearButtons();
                winsO++;
                lblWinsO.setText("O: " + winsO);
            }
            player = 'x';
        }
    }

    private boolean playerWon() {
        if (player == 'x') {
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X"))
                return true;
            else if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X"))
                return true;
            else if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X"))
                return true;
            else if (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X"))
                return true;
            else if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X"))
                return true;
            else if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X"))
                return true;
            else if (btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X"))
                return true;
            else return btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X");
        } else {
            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O"))
                return true;
            else if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O"))
                return true;
            else if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O"))
                return true;
            else if (btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O"))
                return true;
            else if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O"))
                return true;
            else if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O"))
                return true;
            else if (btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O"))
                return true;
            else return btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O");
        }
    }

    private void setButtonsEnabled(boolean e) {
        btn1.setEnabled(e);
        btn2.setEnabled(e);
        btn3.setEnabled(e);
        btn4.setEnabled(e);
        btn5.setEnabled(e);
        btn6.setEnabled(e);
        btn7.setEnabled(e);
        btn8.setEnabled(e);
        btn9.setEnabled(e);
    }

    private void clearButtons() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

}
