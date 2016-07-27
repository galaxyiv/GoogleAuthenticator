package googleoauth.GoogleAuthenticator;

public class googlemain {

	public static void main(String[] args) {
	 
		//生成密钥
		//String secret = GoogleAuthenticator.generateSecretKey();
		//System.out.println(secret);
		//生成二维码图片(需要访问google地址)
		//System.out.println(GoogleAuthenticator.getQRBarcodeURL(
		//		"Name of the app", "MoreinfoABouttheApp2", secret));
		//
		//XD3EQORJ3K5D3D6N
		//https://www.google.com/chart?chs=300x300&chld=M%7C0&cht=qr&chl=otpauth://totp/Name of the app@MoreinfoABouttheApp2%3Fsecret%3DXD3EQORJ3K5D3D6N

		//根据密钥去校验动态密码
		System.err.println( String.valueOf(  GoogleAuthenticator.authcode("363739", "XD3EQORJ3K5D3D6N")  )  );
	}
}
