package com.blg.edu.common.util;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-11
 */
public class SHA256Utils {

    /**
     * 散列算法类型为SHA256
     */
    private static final String ALGORITH_NAME = Sha256Hash.ALGORITHM_NAME;
    /**
     * hash的次数
     */
    private static final int HASH_ITERATIONS = 1024;

    public static String encrypt(String salt, String password) {
        return new SimpleHash(ALGORITH_NAME, password, ByteSource.Util.bytes(salt), HASH_ITERATIONS).toHex();
    }
}
