package com.alibaba.csp.sentinel;

import com.alibaba.csp.sentinel.context.Context;
import com.alibaba.csp.sentinel.context.ContextTestUtil;
import com.alibaba.csp.sentinel.context.ContextUtil;
import com.alibaba.csp.sentinel.slotchain.StringResourceWrapper;

import com.alibaba.csp.sentinel.cluster.TokenServerDescriptor;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Test cases for {@link TokenServerDescriptor}.
 */
public class TokenServerDescriptorTest {
    private TokenServerDescriptor temp;

    @Before
    public void setUp() {
        temp = new TokenServerDescriptor("host", 123);
    }

    @Test
    public void testGetHost() {
        assertEquals("host", temp.getHost());
    }

    @Test
    public void testGetPort() {
        assertEquals(123, temp.getPort());
    }

    @Test
    public void getType() {
        assertEquals("default", temp.getType());
    }

    @Test
    public void testToString() {
        assertEquals("TokenServerDescriptor{" +
            "host='" + "host" + '\'' +
            ", port=" + 123 +
            ", type='" + "default" + '\'' +
            '}', temp.toString());
    }
}