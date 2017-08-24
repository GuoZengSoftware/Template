package top.zywork.common;

import sun.misc.BASE64Encoder;
import top.zywork.enums.AlgorithmEnum;
import top.zywork.enums.CharsetEnum;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类
 * 创建于2017-08-15
 *
 * @author 王振宇
 * @version 1.0
 * @see top.zywork.enums.AlgorithmEnum
 */
public class EncryptUtils {

    /**
     * md5加密
     * @param str 明文
     * @return 使用MD5加密算法得到的密文
     */
    public static String md5(String str) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, AlgorithmEnum.MD5.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encryptStr;
    }

    /**
     * sha1加密
     * @param str 明文
     * @return 使用sha1加密算法得到的密文
     */
    public static String sha1(String str) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, AlgorithmEnum.SHA1.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encryptStr;
    }

    /**
     * 单向加密，使用Base64编码
     * @param str 需要加密的明文
     * @param type 加密或消息摘要算法名称
     * @return 通过指定加密算法得到的密文
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String oneWayEncrypt(String str, String type) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance(type);
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] bytes = str.getBytes(CharsetEnum.UTF8.getValue());
        md.update(bytes);
        return encoder.encode(md.digest(bytes));
    }

}
