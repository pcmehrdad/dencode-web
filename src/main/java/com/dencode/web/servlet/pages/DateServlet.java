/*!
 * dencode-web
 * Copyright 2016 Mozq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dencode.web.servlet.pages;

import javax.servlet.annotation.WebServlet;

import com.dencode.web.servlet.AbstractDencodeHttpServlet;

@WebServlet("/date")
public class DateServlet extends AbstractDencodeHttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet() throws Exception {
		reqres().setAttribute("type", "date");
		reqres().setAttribute("method", "date");
		
		reqres().setAttribute("useOe", false);
		reqres().setAttribute("useNl", false);
		reqres().setAttribute("useTz", true);
		
		reqres().setAttribute("hasEncoded", true);
		reqres().setAttribute("hasDecoded", false);
		
		forward("/index");
	}
}

