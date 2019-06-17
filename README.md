# PDV: an integrative proteomics data viewer

[![Join the chat at https://gitter.im/PDV-public/Lobby](https://badges.gitter.im/PDV-public/Lobby.svg)](https://gitter.im/PDV-public/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) ![Downloads](https://img.shields.io/github/downloads/wenbostar/PDV/total.svg) ![Release](https://img.shields.io/github/release/wenbostar/PDV.svg)


PDV is a JAVA tool for proteomics data visualization.

[<img src="https://github.com/wenbostar/PDV/blob/master/resources/PDV_main_panel.png" width=600 class="center">](https://doi.org/10.1093/bioinformatics/bty770)

## Usage

A user's manual is available at [http://pdv.zhang-lab.org](http://pdv.zhang-lab.org).
You can find some visualization examples in the [user's manual](http://pdv.zhang-lab.org/data/download/PDV-Manual.pdf) or the [manuscript of PDV](https://doi.org/10.1093/bioinformatics/bty770).

## Installation

The PDV package can be downloaded at [https://github.com/wenbostar/PDV/releases](https://github.com/wenbostar/PDV/releases).

## Example

#### Database searching:

| Software        | Example files |
| ----------------|:---------------|
| [MS-GF+](https://github.com/MSGFPlus/msgfplus) (v2017.01.13)| [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/msgfplus/SF_200217_U2OS_TiO2_HCD_OT_rep1_mgf.mzid.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/msgfplus/SF_200217_U2OS_TiO2_HCD_OT_rep1_mzML.mzid.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/msgfplus/SF_200217_U2OS_TiO2_HCD_OT_rep1_mzXML.mzid.gz)|
| [X!Tandem](https://www.thegpm.org/tandem/) (v2017.2.1.2) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/xtandem/SF_200217_U2OS_TiO2_HCD_OT_rep1_mgf.mzid.gz) (convert X!Tandem XML result to mzid file using [MzidLib](https://github.com/PGB-LIV/mzidlib))|
| [MyriMatch](https://www.ncbi.nlm.nih.gov/pubmed/?term=17269722) (v2.2.10165) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mgf.mzid.gz)<br>[mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mgf.pepXML.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzML.mzid.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzML.pepXML.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzXML.mzid.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/myrimatch/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzXML.pepXML.gz) |
| [Comet](http://comet-ms.sourceforge.net/) (v2018.01 rev. 2) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/comet/SF_200217_U2OS_TiO2_HCD_OT_rep1_mgf.pep.xml.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/comet/SF_200217_U2OS_TiO2_HCD_OT_rep1_mzML.pep.xml.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/comet/SF_200217_U2OS_TiO2_HCD_OT_rep1_mzXML.pep.xml.gz) |
| [Crux/Tide](http://crux.ms/) (v3.2)| [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mgf/tide-search.pep.xml.gz)<br> [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mgf/tide-search.mzid.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mzml/tide-search.pep.xml.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mzml/tide-search.mzid.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mzxml/tide-search.pep.xml.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/crux/crux-output_mzxml/tide-search.mzid.gz) |
| [MS Amanda](http://ms.imp.ac.at/index.php?action=ms-amanda) (v2.0.0.11219) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[csv](http://pdv.zhang-lab.org/data/download/test_data/msamanda/SF_200217_U2OS_TiO2_HCD_OT_rep1_MSAmanda_mgf.csv.gz)(MS Amanda format)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[csv](http://pdv.zhang-lab.org/data/download/test_data/msamanda/SF_200217_U2OS_TiO2_HCD_OT_rep1_MSAmanda_mzML.csv.gz)(MS Amanda format) |
| [MSFragger](https://www.nature.com/articles/nmeth.4256) (v20180316) | [mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/msfragger/SF_200217_U2OS_TiO2_HCD_OT_rep1_msfragger_mzML.pepXML.gz)<br>[mzXML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/msfragger/SF_200217_U2OS_TiO2_HCD_OT_rep1_msfragger_mzXML.pepXML.gz)|
| [MaxQuant](http://www.coxdocs.org/doku.php?id=maxquant:start) | [version 1.3.0.5](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.3.0.5.tar.gz)<br>[version 1.5.3.30](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.5.3.30.tar.gz)<br>[version 1.5.4.1](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.5.4.1.tar.gz)<br>[version 1.5.7.4](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.5.7.4.tar.gz)<br>[version 1.5.8.3](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.5.8.3.tar.gz)<br>[version 1.6.2.3](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.6.2.3.tar.gz)<br>[version 1.6.5.0](http://pdv.zhang-lab.org/data/download/test_data/maxquant/maxquant_1.6.5.0.tar.gz) |
| [IPeak](https://www.ncbi.nlm.nih.gov/pubmed/25951428)| [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/ipeak/SF_200217_U2OS_TiO2_HCD_OT_rep1_IPeak_mgf.mzid.gz) |
| [IdentiPy](https://bitbucket.org/levitsky/identipy) (v0.2)|[mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/identipy/SF_200217_U2OS_TiO2_HCD_OT_rep1_identipy_mgf.pep.xml.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/identipy/SF_200217_U2OS_TiO2_HCD_OT_rep1_identipy_mzML.pep.xml.gz)|
| [MetaMorpheus](https://github.com/smith-chem-wisc/MetaMorpheus) (v0.0.286) | [mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/MetaMorpheus/SF_200217_U2OS_TiO2_HCD_OT_rep1_MetaMorpheus_mzML.mzid.gz)|
| [OMSSA](https://pubchem.ncbi.nlm.nih.gov/omssa/) (v2.1.9) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/omssa/SF_200217_U2OS_TiO2_HCD_OT_rep1_omssa_mgf.pep.xml.gz) |
| [Mascot](http://www.matrixscience.com/) (v2.5.1) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/mascot/F011632_mgf.pep.xml.gz)<br>[mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/mascot/F011632_mgf.mzid.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/mascot/F011635_mzML.pep.xml.gz)<br>[mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[mzid](http://pdv.zhang-lab.org/data/download/test_data/mascot/F011635_mzML.mzid.gz) <br> [dat](http://www.matrixscience.com/help/export_help.html#MascotDAT)|
| [Proteome Discoverer](https://www.thermofisher.com/order/catalog/product/OPTON-30809?SID=srch-srp-OPTON-30809)| TODO |
| [ProteinPilot](https://sciex.com/products/software/proteinpilot-software) | TODO |
| [PEAKS](http://www.bioinfor.com/peaks-studio/) | TODO |
| [pFind](http://pfind.net/) (>=v3.1.5) | Only supported MGF file search result |
| [TPP](http://tools.proteomecenter.org/wiki/index.php?title=Software:TPP) (v5.1.0) | [mzML](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz):[pepXML](http://pdv.zhang-lab.org/data/download/test_data/tpp/tpp_comet.tar.gz) (Comet + PeptideProphet + iProphet + PTMProphet) |



#### Denovo sequencing:

| Software        | Example files |
| ----------------|:---------------|
| [Novor](https://www.ncbi.nlm.nih.gov/pubmed/26122521) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[csv](http://pdv.zhang-lab.org/data/download/test_data/novor/SF_200217_U2OS_TiO2_HCD_OT_rep1.novor.csv.gz) (only support the Novor result generated through [DeNovoGUI](https://github.com/compomics/denovogui)) |
| [DeepNovo](https://github.com/nh2tran/DeepNovo) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/deepnovo/peaks.db.mgf.test.dup.mgf.gz):[txt](http://pdv.zhang-lab.org/data/download/test_data/deepnovo/output.deepnovo_db.tab) |
| [PepNovo+](http://proteomics.ucsd.edu/software-tools/531-2/) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[txt](http://pdv.zhang-lab.org/data/download/test_data/pepnovo/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.out) |
| [pNovo+](http://pfind.ict.ac.cn/software/pNovo/) | [mgf](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf.gz):[txt](http://pdv.zhang-lab.org/data/download/test_data/pnovo/pNovo_output.zip) |

#### Proteogenomics:


| Type        | Example files |
| ------------|---------------|
| [proBAM](https://genomebiology.biomedcentral.com/articles/10.1186/s13059-017-1377-x) | [ProBAM.tar.gz](http://pdv.zhang-lab.org/data/download/upload/ProBAM.tar.gz) |
| [proBed](https://genomebiology.biomedcentral.com/articles/10.1186/s13059-017-1377-x) | [ProBed.tar.gz](http://pdv.zhang-lab.org/data/download/upload/ProBed.tar.gz) |

#### One PSM:


#### Spectrum library:

[Spectrum Library Central at PeptideAtlas](http://www.peptideatlas.org/speclib/)

#### MS data:

| Type   |Example files|
| -------|-------------|
| mzML | [SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML.gz) |
| mzXML|[SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz](http://pdv.zhang-lab.org/data/download/test_data/msdata/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzXML.gz) |

#### PRIDE XML:

[PRIDE_Exp_Complete_Ac_22028.xml.gz](https://www.ebi.ac.uk/pride/data/archive/2016/12/PRD000656/PRIDE_Exp_Complete_Ac_22028.xml.gz)

#### QC analysis:

Please find an example in this tutorial: [QC analysis](http://bioconductor.org/packages/devel/bioc/vignettes/proteoQC/inst/doc/proteoQC.html). 

#### Command line:

PDV provides a command line module to produce figures of annotated spectra or TIC in batch mode. It can be used to generate figures according to a list of peptide sequences or a list of spectrum indexes.

```sh
 $ java -jar PDV-1.1.0/PDV-1.1.0.jar -h
```

```
usage: Options
 -a <arg>    Error window for MS/MS fragment ion mass values. Unit is Da.
             The default value is 0.5.
 -ah         Whether or not to consider neutral loss of H2O.
 -an         Whether or not to consider neutral loss of NH3.
 -c <arg>    The intensity percentile to consider for annotation. Default
             is 3 (3%), it means that the peaks with intensities >= (3% *
             max intensity) will be annotated.
 -fh <arg>   Figure height. Default is 400
 -ft <arg>   Figure type. Can be png, pdf or tiff.
 -fu <arg>   The units in which ‘height’(fh) and ‘width’(fw) are given.
             Can be cm, mm or px. Default is px
 -fw <arg>   Figure width. Default is 800
 -h          Help
 -help       Help
 -i <arg>    A file containing peptide sequences or spectrum IDs. PDV will
             generate figures for these peptides or spectra.
 -k <arg>    The input data type for parameter -i (Spectrum ID: s, peptide
             sequence: p).
 -o <arg>    Output directory.
 -pw <arg>   Peak width. Default is 1
 -r <arg>    Identification file.
 -rt <arg>   Identification file format (mzIdentML: 1, pepXML: 2, proBAM:
             3, txt: 4, maxQuant: 5, TIC: 6).
 -s <arg>    MS/MS data file
 -st <arg>   MS/MS data format (mgf: 1, mzML: 2, mzXML: 3).
```

Please find a few examples below. Please download the example data here: [input_data.tar.gz](http://pdv.zhang-lab.org/data/download/test_data/cmd/input_data.tar.gz)

(1) Input: mgf and mzID
```bash
java -jar PDV-1.1.0/PDV-1.1.0.jar -r input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mgf.mzid -rt 1 -s input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf -st 1 -i input_data/spectrum_title.txt -k s -o output -a 0.05 -c 3 -pw 1 -fw 800 -fh 400 -fu px -ft pdf
```
(2) Input: mzML and mzID
```
java -jar PDV-1.1.0/PDV-1.1.0.jar -r input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzML.mzid -rt 1 -s input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML -st 2 -i input_data/spectrum_scan_number.txt -k s -o output -a 0.05 -c 3 -pw 1 -fw 800 -fh 400 -fu px -ft pdf
```
(3) Input: mgf and pepXML
```
java -jar PDV-1.1.0/PDV-1.1.0.jar -r input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mgf.pepXML -rt 2 -s input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1.mgf -st 1 -i input_data/spectrum_title.txt -k s -o output -a 0.05 -c 3 -pw 1 -fw 800 -fh 400 -fu px -ft pdf
```
(4) Input mzML and pepXML
```
java -jar PDV-1.1.0/PDV-1.1.0.jar -r input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1_myrimatch_mzML.pepXML -rt 2 -s input_data/SF_200217_U2OS_TiO2_HCD_OT_rep1.mzML -st 2 -i input_data/spectrum_scan_number.txt -k s -o output -a 0.05 -c 3 -pw 1 -fw 800 -fh 400 -fu px -ft pdf
```
## Citation

To cite the `PDV` package in publications, please use:

Li, K., et al. "PDV: an integrative proteomics data viewer." Bioinformatics, Volume 35, Issue 7, 01 April 2019, Pages 1249–1251. [https://doi.org/10.1093/bioinformatics/bty770](https://doi.org/10.1093/bioinformatics/bty770)

## List of citations

`PDV` has been cited or used in the following manuscripts:
1. Wang X, Codreanu S G, Wen B, et al. Detection of proteome diversity resulted from alternative splicing is limited by trypsin cleavage specificity. Molecular & Cellular Proteomics, 2017: mcp. RA117. 000155.
2. Menschaert G, Wang X, Jones A R, et al. The proBAM and proBed standard formats: enabling a seamless integration of genomics and proteomics data. Genome biology, 2018, 19(1): 12.
3. Wen, Bo, Xiaojing Wang, and Bing Zhang. "PepQuery enables fast, accurate, and convenient proteomic validation of novel genomic alterations." Genome research 29.3 (2019): 485-493.
4. Rong, Mingqiang, et al. "PPIP: Automated Software for Identification of Bioactive Endogenous Peptides." Journal of proteome research 18.2 (2018): 721-727.
5. Zhang X, Huang H, He Y, et al. High-throughput identification of heavy metal binding proteins from the byssus of chinese green mussel (Perna viridis) by combination of transcriptome and proteome sequencing. PloS one, 2019, 14(5): e0216605.
6. Ren, Zhe, et al. "Improvements to the Rice Genome Annotation Through Large-Scale Analysis of RNA-Seq and Proteomics Data Sets." Molecular & Cellular Proteomics 18.1 (2019): 86-98.
## Contribution

Contributions to the package are more than welcome. 

[![Analytics](https://ga-beacon-nocache.appspot.com/UA-99895661-4/PDV?pixel)](https://github.com/igrigorik/ga-beacon)
