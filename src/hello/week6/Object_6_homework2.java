package hello.week6;

import java.util.Scanner;

/* ��GPS���ݴ���
 ��Ŀ���ݣ�
 NMEA-0183Э����Ϊ���ڲ�ͬ��GPS��ȫ��λϵͳ�������豸�н���ͳһ��BTCM���������ߵ缼��ίԱ�ᣩ��׼�����������Һ������Э�ᣨNMEA-The National Marine Electronics Associa-tion���ƶ���һ��ͨѶЭ�顣
 GPS���ջ�����NMEA-0183Э��ı�׼�淶����λ�á��ٶȵ���Ϣͨ�����ڴ��͵�PC����PDA���豸��
 NMEA-0183Э����GPS���ջ�Ӧ�����صı�׼Э�飬Ҳ��ĿǰGPS���ջ���ʹ����㷺��Э�飬�����������GPS���ջ���GPS���ݴ��������������������ػ������ټ������Э�顣
 NMEA-0183Э�鶨������ǳ��࣬���ǳ��õĻ���˵�������������ֻ��$GPGGA��$GPGSA��$GPGSV��$GPRMC��$GPVTG��$GPGLL�ȡ�

 ����$GPRMC���ĸ�ʽ���£�
 $GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50
 �������������һ���ı��У������Զ��š�,�����������ֶΣ�ÿ���ֶεĴ�С�����ȣ���һ�������ʾ��ֻ��һ�ֿ��ܣ���������Ϊ�ֶεĴ�С������������һ����

 �ֶ�0��$GPRMC�����ID�����������ΪRecommended Minimum Specific GPS/TRANSIT Data��RMC���Ƽ���С��λ��Ϣ
 �ֶ�1��UTCʱ�䣬hhmmss.sss��ʽ
 �ֶ�2��״̬��A=��λ��V=δ��λ
 �ֶ�3��γ��ddmm.mmmm���ȷָ�ʽ��ǰ��λ��������0��
 �ֶ�4��γ��N����γ����S����γ��
 �ֶ�5������dddmm.mmmm���ȷָ�ʽ��ǰ��λ��������0��
 �ֶ�6������E����������W��������
 �ֶ�7���ٶȣ��ڣ�Knots
 �ֶ�8����λ�ǣ���
 �ֶ�9��UTC���ڣ�DDMMYY��ʽ
 �ֶ�10����ƫ�ǣ���000 - 180���ȣ�ǰ��λ��������0��
 �ֶ�11����ƫ�Ƿ���E=��W=��
 �ֶ�16��У��ֵ

 �����*��ΪУ���ʶ�������������λ��ΪУ��ͣ������ˡ�$���͡�*��֮�������ַ����������������ַ��������ֵ��ʮ������ֵ���������������У�����ʮ�����Ƶ�50��Ҳ����ʮ���Ƶ�80��

 ��ʾ��^����������������
 ��$��*֮�����е��ַ���^����(��һ���ַ��͵ڶ����ַ���򣬽���ٺ͵������ַ������������)֮���ֵ��65536ȡ���Ľ����Ӧ�ú�*���������ʮ���������ֵ�ֵ��ȣ�����Ļ�˵����������ڴ����з����˴���
 ע�����ʮ������ֵ���ǻ����A-F�Ĵ�д��ĸ�ġ�
 ���⣬�������Ҫ�Ļ���������Integer.parseInt(s)��String����s�еõ����������������֣�
 ��Integer.parseInt(s, 16)��String����s�еõ���������ʮ����������

 ���ڣ���ĳ���Ҫ����һϵ��GPS��������а���$GPRMC��Ҳ����������䡣�����ݵ������һ�е�����END��ʾ���ݵĽ�����
 ��ĳ���Ҫ�����ҳ�$GPRMC��䣬����У��ͣ��ҳ�����У����ȷ�������ֶ�2��ʾ�Ѷ�λ����䣬���м����ʱ�䣬����ɱ���ʱ�䡣
 һ�������л��������$GPRMC��䣬�����һ�����õ��ı���ʱ����Ϊ��������
 ��ĳ���һ�������һ����Ч��$GPRMC��䡣

 �����ʽ:
 ����GPS��䣬ÿ�����Իس����н��������һ����END������д��ĸ��

 �����ʽ��
 6λ��ʱ�䣬���Ϊ��
 hh:mm:ss
 ���У�hh����λ����Сʱ��������λʱǰ�油0��mm����λ���ķ��ӣ�������λʱǰ�油0��ss����λ�����룬������λʱǰ�油0��

 ����������
 $GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50
 END

 ���������
 10:48:13

 024813
 +80000
 104813

 ˼·:
 1.��û����END֮ǰ,ѭ��
 2.�������
 �ַ�������str�洢������ַ���
 �ַ�������substr�洢$��*֮��������ַ�
 �ַ�������code��¼*�������λ��
 ��������
 3.�ַ���������������㣬�ٶ�65536ȡ�ࡣ
 ת����16���ƺ������*�����code�������ȣ���ʼ���㡣

 4.UTCת����BJT
 ��������UTC�洢��һ��"��"���������
 ���UTC<160000,ֱ��+80000;����UTC-160000
 BJT
 ���Ҫ������ַ�������ret

 */
public class Object_6_homework2 {
	// У���Ƿ���ȷ
	public static boolean isRight(String str) {
		String substr; // $��*֮����Ӵ�
		int num; // �Ӵ������ֵ
		String code; // *���У����

		substr = str.substring(str.indexOf('$') + 1, str.indexOf('*'));
		num = substr.charAt(0) ^ substr.charAt(1);
		// ����У��ֵ
		for (int i = 2; i < substr.length(); i++) {
			num = num ^ substr.charAt(i);
		}
		num = num % 65536;
		code = str.substring(str.indexOf('*') + 1);
		return (num == Integer.parseInt(code, 16));
	}

	// �ж��Ƿ��Ѷ�λ
	public static boolean isLoc(String str) {
		// ��һ������������
		int first = str.indexOf(",");
		// �ڶ�����������
		int secend = str.indexOf(",", first + 1);
		// ��������������
		int third = str.indexOf(",", secend + 1);
		String substr = str.substring(secend + 1, third); // �ڶ��ֶ�,���ڶ���������������֮��
		if (substr.equals("A")) {
			return true;
		} else {
			return false;
		}

	}

	// ��׼��ʽ��ʱ�� ��hhmmssת����hh��mm��ss
	public static String formatTime(int time) {
		return String.format("%02d:%02d:%02d\n", time / 10000,
				(time % 10000) / 100, time % 100);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); // ������ַ���
		int UTC; // �ֶ�1����������
		int BJT; // �ֶ�1ת����BJT
		String ret = ""; // �������Ľ��

		while (!str.equals("END")) {
			// У��ɹ�
			if (isRight(str) && isLoc(str)) {
				UTC = Integer.parseInt(str.substring(str.indexOf(',') + 1,
						str.indexOf('.')));
				if (UTC < 160000) {
					BJT = UTC + 80000;
				} else {
					BJT = UTC - 160000;
				}
				ret = formatTime(BJT);
			}
			str = in.nextLine();
		}
		System.out.print(ret);
	}
}