/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.schema.analysis.tokenizer;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.lucene.analysis.core.LowerCaseTokenizer;

/**
 * A {@link LowerCaseTokenizerBuilder} for building {@link org.apache.lucene.analysis.core.LowerCaseTokenizer}
 *
 * @author Juan Pedro Gilaberte {@literal <jpgilaberte@stratio.com>}
 */
public class LowerCaseTokenizerBuilder extends TokenizerBuilder<LowerCaseTokenizer> {

    /**
     * Builds a new {@link LowerCaseTokenizerBuilder}
     */
    @JsonCreator
    public LowerCaseTokenizerBuilder() {
    }

    /** {@inheritDoc} */
    @Override
    public LowerCaseTokenizer buildTokenizer() {
        return new LowerCaseTokenizer();
    }
}