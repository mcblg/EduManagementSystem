package com.blg.edu.common.util;

import com.blg.edu.common.exception.SessionAttributeNotExistException;
import com.blg.edu.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public class SessionAttributeUtil {

    public static Object getSessionAttribute(String key) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        Object attribute = session.getAttribute(key);
        if (attribute == null) {
            throw new SessionAttributeNotExistException(null);
        }
        return attribute;
    }
}
