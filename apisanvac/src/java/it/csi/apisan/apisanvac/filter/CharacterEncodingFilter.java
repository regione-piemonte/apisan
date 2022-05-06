/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	public CharacterEncodingFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("passo dal filter charter encoding: " + arg0.getCharacterEncoding());
		arg0.setCharacterEncoding("UTF-8");
		System.out.println("passo dal filter charter encoding2: " + arg0.getCharacterEncoding());
		System.out.println("getContentType: " + arg0.getContentType());
		
		
		for(Enumeration<String> en = arg0.getParameterNames(); en.hasMoreElements();) {
			String parametro = en.nextElement();
			System.out.println("parametro:" + parametro + " " + arg0.getParameter(parametro) );
		}
		arg2.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
