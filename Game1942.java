import java.awt.Dimension;

import javax.swing.JFrame;

public class Game1942 {

	/**
	 * 程式的入口點。
	 * 
	 * @param args 命令列參數 (未使用)
	 */
	public static void main(String[] args) {
		// 遊戲視窗尺寸
		final int WIDTH = 384;
		final int HEIGHT = 512;

		// 創建主視窗
		JFrame frame = new JFrame("1942 - Java Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 創建遊戲面板
		GamePanel panel = new GamePanel(WIDTH, HEIGHT);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

		// 設定視窗內容
		frame.add(panel);
		frame.pack(); // 讓視窗尺寸適應元件
		frame.setLocationRelativeTo(null); // 視窗置中
		frame.setResizable(false);
		frame.setVisible(true);

		// 確保 GamePanel 取得焦點，以接收鍵盤輸入 (即使使用 Key Bindings 也是好習慣)
		panel.requestFocusInWindow();

		// 啟動遊戲執行緒
		panel.startGameLoop();
	}
}