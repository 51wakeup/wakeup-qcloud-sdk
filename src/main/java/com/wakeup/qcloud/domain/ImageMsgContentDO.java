package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.IMMsgType;

/**
 * @since 2017年2月27日
 * @author kalman03
 */
public class ImageMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = 8032097711501314859L;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMImageElem;
	}

	/**
	 * 图片序列号。后台用于索引图片的键值。
	 */
	@JSONField(name = "UUID")
	private String uuid;
	/**
	 * 图片格式。BMP=1,JPG=2,GIF=3,其他=0。
	 */
	@JSONField(name = "ImageFormat")
	private int imageFormat;
	/**
	 * 原图、缩略图或者大图下载信息。
	 */
	@JSONField(name = "ImageInfoArray")
	private List<ImageInfoArray> imageInfoArray;

	public static class ImageInfoArray {
		/**
		 * 图片类型： 1-原图，2-大图 3-缩略图。
		 */
		@JSONField(name = "Type")
		private int type;
		/**
		 * 图片数据大小。
		 */
		@JSONField(name = "Size")
		private long size;
		/**
		 * 图片宽度。
		 */
		@JSONField(name = "Width")
		private int width;
		/**
		 * 图片高度。
		 */
		@JSONField(name = "Height")
		private int height;
		/**
		 * 图片下载地址。
		 */
		@JSONField(name = "URL")
		private String url;

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public long getSize() {
			return size;
		}

		public void setSize(long size) {
			this.size = size;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getImageFormat() {
		return imageFormat;
	}

	public void setImageFormat(int imageFormat) {
		this.imageFormat = imageFormat;
	}

	public List<ImageInfoArray> getImageInfoArray() {
		return imageInfoArray;
	}

	public void setImageInfoArray(List<ImageInfoArray> imageInfoArray) {
		this.imageInfoArray = imageInfoArray;
	}
}
