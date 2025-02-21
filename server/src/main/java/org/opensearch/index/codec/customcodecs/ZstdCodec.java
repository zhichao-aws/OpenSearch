/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.index.codec.customcodecs;

import org.apache.logging.log4j.Logger;
import org.opensearch.index.mapper.MapperService;

/**
 * ZstdCodec provides ZSTD compressor using the <a href="https://github.com/luben/zstd-jni">zstd-jni</a> library.
 */
public class ZstdCodec extends Lucene95CustomCodec {

    /**
     * Creates a new ZstdCodec instance with the default compression level.
     */
    public ZstdCodec() {
        this(DEFAULT_COMPRESSION_LEVEL);
    }

    /**
     * Creates a new ZstdCodec instance.
     *
     * @param compressionLevel The compression level.
     */
    public ZstdCodec(int compressionLevel) {
        super(Mode.ZSTD, compressionLevel);
    }

    public ZstdCodec(MapperService mapperService, Logger logger) {
        super(Mode.ZSTD, DEFAULT_COMPRESSION_LEVEL, mapperService, logger);
    }

    /** The name for this codec. */
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
