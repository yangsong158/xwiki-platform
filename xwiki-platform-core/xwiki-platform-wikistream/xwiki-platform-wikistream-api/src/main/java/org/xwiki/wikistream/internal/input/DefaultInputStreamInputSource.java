/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.wikistream.internal.input;

import java.io.IOException;
import java.io.InputStream;

import org.xwiki.wikistream.input.InputStreamInputSource;

/**
 * 
 * @version $Id$
 * @since 5.2M2
 */
public class DefaultInputStreamInputSource implements InputStreamInputSource
{
    private final InputStream inputStream;

    public DefaultInputStreamInputSource(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }

    public InputStream getInputStream()
    {
        return this.inputStream;
    }

    @Override
    public void close() throws IOException
    {
        // Closing the stream is the responsibility of the caller
    }

    @Override
    public String toString()
    {
        return getInputStream().toString();
    }
}