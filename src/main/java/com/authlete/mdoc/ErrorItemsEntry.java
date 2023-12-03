/*
 * Copyright (C) 2023 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.authlete.mdoc;


import com.authlete.cbor.CBORInteger;
import com.authlete.cbor.CBORPair;
import com.authlete.cbor.CBORString;


/**
 * An entry in the {@link ErrorItems} structure.
 *
 * <p>
 * For details, see ISO/IEC 18013-5:2021, 8.3.2.1.2.2 Device retrieval mdoc response.
 * </p>
 *
 * <h3>Definition</h3>
 *
 * <pre>
 * ErrorItems = {
 *     + DataElementIdentifier => ErrorCode
 * }
 *
 * ErrorCode = int
 * </pre>
 *
 * @since 1.5
 *
 * @see <a href="https://www.iso.org/standard/69084.html">ISO/IEC 18013-5:2021</a>
 *
 * @see Errors
 *
 * @see ErrorItems
 */
public class ErrorItemsEntry extends CBORPair
{
    public ErrorItemsEntry(CBORString dataElementIdentifier, CBORInteger errorCode)
    {
        super(dataElementIdentifier, errorCode);
    }


    public ErrorItemsEntry(CBORString dataElementIdentifier, int errorCode)
    {
        this(dataElementIdentifier, new CBORInteger(errorCode));
    }


    public ErrorItemsEntry(String dataElementIdentifier, CBORInteger errorCode)
    {
        this(new CBORString(dataElementIdentifier), errorCode);
    }


    public ErrorItemsEntry(String dataElementIdentifier, int errorCode)
    {
        this(new CBORString(dataElementIdentifier), new CBORInteger(errorCode));
    }
}
