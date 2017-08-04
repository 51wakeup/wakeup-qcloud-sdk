package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年8月2日
 * @author kalman03
 */
public class MixStreamDO extends BaseDO {

	private static final long serialVersionUID = -5773888258770657252L;
	
	@JSONField(name = "interface")
	private String _interface = "mix_streamv2.start_mix_stream_advanced";
	
	@JSONField(name = "app_id")
	private String appId;// 填写直播APPID
	
	@JSONField(name = "mix_stream_session_id")
	private String mixStreamSessionId;// 填大主播的流ID

	@JSONField(name = "output_stream_id")
	private String outputStreamId;// 混流输出流ID,必选，填大主播的流ID

	@JSONField(name = "output_stream_type")
	private int outputStreamType = 0;// 混流输出流类型,可选，指定输出流类型。当输出流为输入流list中的一条时，填写0；当输出流为一条新的流，并非输入流list中的流时，该值为1。不填默认为0。

	@JSONField(name="input_stream_list")
	private List<MixInputStream> inputStreamList;
	
	public class MixInputStream extends BaseDO {
		private static final long serialVersionUID = -509212175128025562L;
		@JSONField(name = "input_stream_id")
		private String inputStreamId;// 流ID
		@JSONField(name = "layout_params")
		private MixInputStreamLayoutParams layoutParams;

		public String getInputStreamId() {
			return inputStreamId;
		}

		public void setInputStreamId(String inputStreamId) {
			this.inputStreamId = inputStreamId;
		}

		public MixInputStreamLayoutParams getLayoutParams() {
			return layoutParams;
		}

		public void setLayoutParams(MixInputStreamLayoutParams layoutParams) {
			this.layoutParams = layoutParams;
		}
	}

	public class MixInputStreamLayoutParams extends BaseDO {
		private static final long serialVersionUID = -1675000712746336361L;
		@JSONField(name = "image_layer")
		private int imageLayer;// 输入流图层ID，必选，图层标识号，目前支持1-6。大主播填 1 ;小主播按照顺序填写2、3、4、5、6
		@JSONField(name = "input_type")
		private Integer inputType = 0;// 混流输入源类型，可选，输入源标识，0表示输入源为流，3表示输入源为画布。
		@JSONField(name = "image_width")
		private Integer imageWidth;// 混流输入源像素宽值，可选，输入画面的宽度。建议在0-3000以内。
		@JSONField(name = "image_height")
		private Integer imageHeight;// 混流输入源像素高值，可选， 输入画面的高度。建议在0-3000以内。
		@JSONField(name = "location_x")
		private Integer locationX;// 横坐标绝度位置，可选，x偏移：相对于大主播背景画面左上角的横向偏移。
		@JSONField(name = "location_y")
		private Integer locationY;// 纵坐标绝对位置，可选，y偏移：相对于大主播背景画面左上角的纵向偏移。
		/**
		 * 画布颜色，当输入源为画布时，必须输入颜色。
		 * 常见颜色如下：
		 * 红色：0xcc0033
		 * 
		 * 黄色：0xcc9900
		 * 
		 * 绿色：0xcccc33
		 * 
		 * 蓝色：0x99CCFF
		 * 
		 * 黑色：0x000000
		 * 
		 * 白色：0xFFFFFF
		 * 
		 * 灰色：0x999999
		 */
		private String color;
		public int getImageLayer() {
			return imageLayer;
		}
		public void setImageLayer(int imageLayer) {
			this.imageLayer = imageLayer;
		}
		public int getInputType() {
			return inputType;
		}
		public void setInputType(int inputType) {
			this.inputType = inputType;
		}
		public int getImageWidth() {
			return imageWidth;
		}
		public void setImageWidth(int imageWidth) {
			this.imageWidth = imageWidth;
		}
		public int getImageHeight() {
			return imageHeight;
		}
		public void setImageHeight(int imageHeight) {
			this.imageHeight = imageHeight;
		}
		public int getLocationX() {
			return locationX;
		}
		public void setLocationX(int locationX) {
			this.locationX = locationX;
		}
		public int getLocationY() {
			return locationY;
		}
		public void setLocationY(int locationY) {
			this.locationY = locationY;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
	}

	public String getMixStreamSessionId() {
		return mixStreamSessionId;
	}

	public void setMixStreamSessionId(String mixStreamSessionId) {
		this.mixStreamSessionId = mixStreamSessionId;
	}

	public String getOutputStreamId() {
		return outputStreamId;
	}

	public void setOutputStreamId(String outputStreamId) {
		this.outputStreamId = outputStreamId;
	}

	public int getOutputStreamType() {
		return outputStreamType;
	}

	public void setOutputStreamType(int outputStreamType) {
		this.outputStreamType = outputStreamType;
	}

	public List<MixInputStream> getInputStreamList() {
		return inputStreamList;
	}

	public void setInputStreamList(List<MixInputStream> inputStreamList) {
		this.inputStreamList = inputStreamList;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String get_interface() {
		return _interface;
	}

	public void set_interface(String _interface) {
		this._interface = _interface;
	}
}
