package cn.hexing.log;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task implements Runnable {

	// 11. 实现 run() 方法。
	@Override
	public void run() {

		// 12. 首先，声明一个 Logger 对象，名为 logger。使用 MyLogger 类的 getLogger()
		// 方法传递这个类的名字为参数来初始它。
		Logger logger = MyLogger.getLogger(this.getClass().getName());

		// 13. 使用 entering() 方法写日志信息表明执行开始。
		logger.entering(Thread.currentThread().getName(), "run()");
		// 休眠2秒。
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 14.使用 exiting() 方法写日志信息表明执行结束
		logger.exiting(Thread.currentThread().getName(), "run()",
				Thread.currentThread());
	}
}
