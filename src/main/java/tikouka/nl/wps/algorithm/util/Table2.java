/*
 * Copyright 2011 by EDINA, University of Edinburgh, Landcare Research
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tikouka.nl.wps.algorithm.util;

/**
 *
 * @author niels
 */
public class Table2 {
	private String id;
	private String key;
	private String value;

	public Table2(String id, String key, String value) {
		this.id = id;
		this.key = key;
                this.value = value;
	}

        public String getId() {
    return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}