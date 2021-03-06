/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.tipos.EnumCodificado;
import coffeepot.br.sped.fiscal.tipos.ParseException;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C112"),
    @Field(name = "codDa"),
    @Field(name = "uf"),
    @Field(name = "numDa"),
    @Field(name = "codAut"),
    @Field(name = "vlDa"),
    @Field(name = "dtVcto"),
    @Field(name = "dtPgto")
})
public class RegC112 {

    private DocumentoArrecadacao codDa;
    private String uf;
    private String numDa;
    private String codAut;
    private Double vlDa;
    private Date dtVcto;
    private Date dtPgto;

    public DocumentoArrecadacao getCodDa() {
        return codDa;
    }

    public void setCodDa(DocumentoArrecadacao codDa) {
        this.codDa = codDa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public Double getVlDa() {
        return vlDa;
    }

    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }

    public Date getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }

    public Date getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(Date dtPgto) {
        this.dtPgto = dtPgto;
    }

    public enum DocumentoArrecadacao implements EnumCodificado {

        ESTADUAL("0"),
        GNRE("1");
        private String codigo;

        private DocumentoArrecadacao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }

        @Override
        public DocumentoArrecadacao parse(String codigo) throws ParseException {
            if ("0".equals(codigo)) {
                return ESTADUAL;
            }
            if ("1".equals(codigo)) {
                return GNRE;
            }
            throw new ParseException("Não foi possível converter o código \"" + codigo + "\" para o tipo RegC112.DocumentoArrecadacao");
        }
    }
}
