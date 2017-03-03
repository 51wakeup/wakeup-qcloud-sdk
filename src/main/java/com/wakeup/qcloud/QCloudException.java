package com.wakeup.qcloud;
/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class QCloudException extends Exception{

	private static final long serialVersionUID = -2381942440622660726L;

	public QCloudException() {
		super();
	}

	public QCloudException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public QCloudException(String message, Throwable cause) {
		super(message, cause);
	}

	public QCloudException(String message) {
		super(message);
	}

	public QCloudException(Throwable cause) {
		super(cause);
	}

}
