import java.text.MessageFormat;

import org.junit.Assert;
import org.junit.Test;

public class MessageFormatTests {

	
	@Test
	public void testEcho() {
		
		String patternNewCaseToExpert = "{0}您好，您有一条新会诊病例（病理号{1}），请登录金域诊断平台（{2}）查阅，谢谢。";//技术员请求远程会诊
		
		String patternAddIHCToLis = "{0}您好，您有一条会诊病例（病理号{1}）由{2}专家申请了加做，请按时完成加做项目，谢谢。";//专家请求加做免疫组化
		String patternAddIHCToExpert = "{0}您好，您有一条会诊病例（病理号{1}）已经加做完毕，请登录金域诊断平台（{2}）查阅，谢谢。";//技术员完成加做免疫组化
		
		String patternChatToLis = "{0}您好，您有一条会诊病例（病理号{1}）由{2}专家提出了反馈意见，请及时回复，谢谢。"; //专家反馈
		String patternChatToExpert = "{0}您好，您有一条会诊病例（病理号{1}）反馈信息回复，请登陆金域诊断平台（{2}）查阅，谢谢。"; //技术员反馈
		
		String patternFinDiagToLis = "{0}您好，您有一条会诊病例（病理号{1}）已结束会诊，请查阅，谢谢。";//专家完成诊断
		String patternTimeoutToLis = "{0}您好，金域诊断平台有病理号{1}已经超时诊断，状态为{2}，请登录进行病例管理，谢谢。";//专家超时
		
		
		String pattern = "{0}您好，您有一条新会诊病例（病理号{1}），请登陆金域诊断平台（{2}）查阅，谢谢。";//
		String[] args = new String[] {"［金域检验］", "123", "http://epathology.kingmed.com.cn:99/obpm"};
		String actual = MessageFormat.format(pattern, args);
		String expected = "［金域检验］您好，您有一条新会诊病例（病理号123），请登陆金域诊断平台（http://epathology.kingmed.com.cn:99/obpm）查阅，谢谢。";
		Assert.assertEquals("相同", expected, actual);
	}
}
